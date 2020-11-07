package test;

import lombok.NonNull;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.*;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.command.Commands;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;

import java.util.Collections;
import java.util.Objects;

/**
 * @author Christian Bernstein
 */
@SuppressWarnings("unused")
@org.bukkit.plugin.java.annotation.plugin.Plugin(name = "osas", version = "1.0.0")
@ApiVersion(ApiVersion.Target.DEFAULT)
@Commands(value = {
        @org.bukkit.plugin.java.annotation.command.Command(name = "osas")
})
public class Plugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Objects.requireNonNull(Bukkit.getPluginCommand("osas")).setExecutor(this);
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = ((Player) sender);

        final Merchant merchant = Bukkit.createMerchant("§e§lHey im a merchant!");
        final MerchantRecipe recipe = new MerchantRecipe(new ItemStack(Material.ACACIA_BOAT, 1), 1);
        recipe.addIngredient(new ItemStack(Material.GOLD_BLOCK, 4));
        merchant.setRecipes(Collections.singletonList(recipe));
        player.openMerchant(merchant, true);

        return true;
    }

    @EventHandler
    public void onInventoryClick(@NonNull InventoryClickEvent event){
        final InventoryView view = event.getView();
        System.out.println("view: " + view.toString());
        System.out.println("slot: " + event.getAction().toString());
    }
}
