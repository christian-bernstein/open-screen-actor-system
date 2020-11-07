package de.christianbernstein.minecraft.osas.configuration;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Locale;
import java.util.Map;

/**
 * @author Christian Bernstein
 */
@Builder
@RequiredArgsConstructor
public class LocalizedString {

    @NonNull
    @Getter
    private final String key;

    @NonNull
    @Getter
    private final Map<Locale, String> values;

    @NonNull
    private String getLocalized(@NonNull Locale locale){
        return this.getValues().get(locale);
    }

    private void setLocalized(@NonNull Locale locale, @NonNull String message){
        this.getValues().put(locale, message);
    }
}
