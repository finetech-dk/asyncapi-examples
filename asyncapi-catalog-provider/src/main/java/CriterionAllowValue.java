

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class CriterionAllowValue {

	public CriterionAllowValue () {
	}

	public CriterionAllowValue (
		String key, 
		String displayValue, 
		Boolean selected) {
		this.key = key;
		this.displayValue = displayValue;
		this.selected = selected;
	}

	private String key;
	@JsonProperty("display_value")
	private String displayValue;
	private Boolean selected;
	public String getKey() {
		return key;
	}

	public CriterionAllowValue setKey(String key) {
		this.key = key;
		return this;
	}


	public String getDisplayValue() {
		return displayValue;
	}

	public CriterionAllowValue setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
		return this;
	}


	public Boolean getSelected() {
		return selected;
	}

	public CriterionAllowValue setSelected(Boolean selected) {
		this.selected = selected;
		return this;
	}

	public String toString() {
		return "CriterionAllowValue ["
		+ " key: " + key
		+ " displayValue: " + displayValue
		+ " selected: " + selected
		+ " ]";
	}
}
