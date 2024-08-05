package me.truemb.tempafk.enums;

public enum GuiName {
	
	MainPage, // Main Page
	ShopMenu; // The Shop Menu

	public static GuiName getGuiNameFromString(String s) {
		if(s == null)
			return null;
		
		for(GuiName action : GuiName.values())
			if(action.toString().equalsIgnoreCase(s))
				return action;
				
		return null;
	}
}
