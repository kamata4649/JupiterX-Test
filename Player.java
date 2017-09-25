
//ゲームモード gamemode
	public int SURVIVAL = 0;
	public int CREATIVE = 1;
	public int ADVENTURE = 2;
	public int SPECTATOR = 3;
	public int VIEW = SPECTATOR;

//Skin boolean
public static boolean isValidSkin(String skin){
	return skin.length() == 64 * 64 * 4  || skin.length() == 64 * 32 * 4;
}
