package test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.SneakyThrows;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.command.Commands;
import org.bukkit.plugin.java.annotation.plugin.Plugin;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Christian Bernstein
 */
@Plugin(name = "CTP", version = "1.0.0")
@Commands(value = {
        @org.bukkit.plugin.java.annotation.command.Command(name = "osas")
})
public class ConfigTestPlugin extends JavaPlugin implements Listener {

    @NonNull
    @Getter
    @Setter
    private File stackFile;

    @SneakyThrows
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        this.setStackFile(new File(this.getDataFolder(), "stack.json"));
        if (!this.getStackFile().exists()) {
            this.getStackFile().getParentFile().mkdir();
            this.getStackFile().createNewFile();
        }
        setDefaultItemStack();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event){
        event.setCancelled(true);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        openSampleInventory(((Player) sender), new ItemStack(Material.GOLD_BLOCK, 1));
        return true;
    }
    
    public void openSampleInventory(@NonNull final Player player, @NonNull final ItemStack stack){
        final Inventory inventory = Bukkit.createInventory(player, InventoryType.DISPENSER, "§e§lDisplay test");
        final ItemStack border = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        final ItemMeta meta = border.getItemMeta();
        meta.setDisplayName(" ");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        border.setItemMeta(meta);
        for (int i = 0; i <= 8; i++) {
            if (i == 4){
                continue;
            }
            inventory.setItem(i, border);
        }
        inventory.setItem(4, this.getDefaultItemStack());
        player.openInventory(inventory);
    }

    public void setDefaultItemStack(){
        final ItemStack stack = new ItemStack(Material.GOLD_BLOCK, 1);
        final ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName("§cHello, im a configurable item");
        stack.setItemMeta(meta);
        try(final FileWriter writer = new FileWriter(this.getStackFile())) {
            new Gson().toJson(stack, writer);
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    public ItemStack getDefaultItemStack(){
        try(final FileReader reader = new FileReader(this.getStackFile())) {
            return new Gson().fromJson(reader, new TypeToken<ItemStack>(){}.getType());
        } catch (final IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
