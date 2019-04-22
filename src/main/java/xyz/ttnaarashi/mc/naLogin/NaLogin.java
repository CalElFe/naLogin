package xyz.ttnaarashi.mc.naLogin;
import com.google.inject.Inject;
import org.spongepowered.api.Game;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "nalogin", name = "NaArashi's Login Plugin", version = "0.0.1",
        description = "",
        url = "https://mc.ttnaarashi.xyz",
        authors = {"SomioNaArashi", "ArCHa"},
        dependencies = {})

public class NaLogin {
    @Inject Game game;
}
