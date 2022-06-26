package daniking.oreberries.util;

import daniking.oreberries.OreBerries;
import net.minecraft.util.Identifier;


/**
 * Namespace for OreBerries mod
 */
public final class OBIdentifier extends Identifier {
    public OBIdentifier(String path) {
        super(OreBerries.MODID, path);
    }
}
