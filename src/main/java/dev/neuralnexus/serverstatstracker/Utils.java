package dev.neuralnexus.serverstatstracker;

public class Utils {
    // Check if the server is running CraftBukkit
    public static boolean isCraftBukkit() {
        try {
            Class.forName("org.bukkit.craftbukkit.Main");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    // Check if the server is running Spigot
    public static boolean isSpigot() {
        try {
            Class.forName("org.spigotmc.CustomTimingsHandler");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    // Check if the server is running Paper
    public static boolean isPaper() {
        try {
            Class.forName("com.destroystokyo.paper.PaperConfig");
            return true;
        } catch (ClassNotFoundException ignored) {}
        try {
            Class.forName("io.papermc.paperclip.Paperclip");
            return true;
        } catch (ClassNotFoundException ignored) {}
        return false;
    }

    // Check if the server is running Folia
    public static boolean isFolia() {
        try {
            Class.forName("io.papermc.paper.threadedregions.RegionizedServer");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    // Check if the server is running Magma
    public static boolean isMagma() {
        try {
            Class.forName("org.magmafoundation.magma.Magma");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    // Check if the server is running Mohist
    public static boolean isMohist() {
        try {
            Class.forName("org.mohistmc.MohistMC");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    // Check if the server is running Arclight
    public static boolean isArclight() {
        try {
            Class.forName("io.izzel.arclight.common.ArclightVersion");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    // Check if the server has Spark installed
    public static boolean hasSpark() {
        try {
            Class.forName("me.lucko.spark.api.Spark");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
