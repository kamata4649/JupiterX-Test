
//ゲームモード gamemode
	public int SURVIVAL = 0;
	public int CREATIVE = 1;
	public int ADVENTURE = 2;
	public int SPECTATOR = 3;
	public int VIEW = SPECTATOR;

//スキンが正しいものか true or false
public static boolean isValidSkin(String skin){
	return skin.length() == 64 * 64 * 4  || skin.length() == 64 * 32 * 4;
}

//API関連
public static boolean nameboolean(Player player){
	if(player.getName().length() >= 2){
		return true;
		
	}else{
		return false;
	}
}
