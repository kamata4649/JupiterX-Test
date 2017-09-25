
//Skin boolean
public static boolean isValidSkin(String skin){
	return skin.length() == 64 * 64 * 4  || skin.length() == 64 * 32 * 4;
}
