package Moedas;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public record modeloMoeda(@SerializedName("conversion_rates") Map<String,String> conversion_rates) {
}
