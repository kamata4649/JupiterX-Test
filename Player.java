
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
//名前が2文字以上は trueを返す
public static boolean nameboolean(){
	if(this.getName().length() >= 2){
		return true;
	}else{
		return false;
	}
}

//Skinの取り出しを高速化させる。Skinをキャッシュさせ、CPU負荷を下げる
ConcurrentHashMap<String, Skin> skin = new ConcurrentHashMap<String, Skin>();
public static Skin skincache(Skin skin){
if(!skin.containsKey(this.getName())){
	skin.put(this.getSkin());
	return this.getSkin();
}else{
	return skin.get(this.getName());
}
}

