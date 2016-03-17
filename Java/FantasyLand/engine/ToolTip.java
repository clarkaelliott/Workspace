package engine;

public class ToolTip {
	
	public ToolTip (String toolTip) {
		this.toolTip = toolTip;
	}
	
	private String toolTip = "This is the default Tooltip";
	
	public String getToolTip() {
		return this.toolTip;
	}
	
	public void setToolTip(String toolTip) {
		this.toolTip = toolTip;
	}

}
