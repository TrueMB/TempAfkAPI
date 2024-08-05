package me.truemb.tempafk.enums;

public enum GuiAction {
	
	NOTHING(null), //Do nothing
	BACK(null), //Going back a Menu
	
	MENU_MAIN(GuiName.MainPage), //Menu -> The Main Start Menu
	MENU_SHOP(GuiName.ShopMenu), //Menu -> Buy Flytime
	SHOP_AFKTIME(null); //Buy extra Flytime to your own
	
	private GuiName guiName;
	
	private GuiAction(GuiName guiName) {
		this.guiName = guiName;
	}

	public static GuiAction getActionFromString(String s) {
		if(s == null)
			return null;
		
		for(GuiAction action : GuiAction.values())
			if(action.toString().equalsIgnoreCase(s))
				return action;
				
		return null;
	}

	public static GuiAction getActionFromGuiName(GuiName guiName) {
		if(guiName == null)
			return null;
		
		for(GuiAction action : GuiAction.values())
			if(action.getGuiName() != null && action.getGuiName().equals(guiName))
				return action;
				
		return null;
	}

	public GuiName getGuiName() {
		return this.guiName;
	}
}
