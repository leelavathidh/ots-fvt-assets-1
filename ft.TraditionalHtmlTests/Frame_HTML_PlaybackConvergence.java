
import resources.Frame_HTML_PlaybackConvergenceHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author SRAVANKUMARREDDY.K
 */
public class Frame_HTML_PlaybackConvergence extends Frame_HTML_PlaybackConvergenceHelper
{
	/**
	 * Script Name   : <b>Frame_HTML_PlaybackConvergence</b>
	 * Generated     : <b>04-Jun-2019 12:07:04 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2019/06/04
	 * @author SRAVANKUMARREDDY.K
	 */
	public void testMain(Object[] args) 
	{
		startBrowser("edge", "http://civcez229.nonprod.hclpnp.com/aries-web/Samples/AllControls/frames/All%20Control%20Sample%20-%20Frame.html");
		
		sleep(5);
		browser_htmlBrowser().maximize();
		
		// Inside frame click at point on edit box 
		
		// input chars & Verify the text
		text__1linebox().click(atPoint(145,10));
		
		browser_htmlBrowser(document_framesWithAllHTMLCont(),DEFAULT_FLAGS).inputChars("Verify text");
		
		text__1linebox().performTest(_1linebox_textVP());
		
		
		//Inside frame click on edit box
		//input keys & verify the text
		
		text__1linebox1().click();
		
		browser_htmlBrowser(document_framesWithAllHTMLCont(),DEFAULT_FLAGS).inputKeys("inputkeys text");
		
		text__1linebox1().performTest(_1linebox1_textVP());
		
		
		//set text & Verify the text on edit box
		sleep(1);
		text__1linebox1().setText("This text is set by settext method");
		
		text__1linebox1().performTest(_1linebox1_text_2VP());
		
		
		
		
		// Inside frame Click at point on scrolling text box 
		// input keys & Verify the text
		
		
		text_scrollbox().click(atPoint(120,21));
		browser_htmlBrowser(document_framesWithAllHTMLCont(),DEFAULT_FLAGS).inputKeys("Scrollint Text with input keys{ENTER}");
		browser_htmlBrowser(document_framesWithAllHTMLCont(),DEFAULT_FLAGS).inputChars("second line");
		text_scrollbox().performTest(Scrollbox_textVP());
		
		//set text and verify the text on scroll box
		
		text_scrollbox().setText("This text is set by settext in this scroll box");
		
		text_scrollbox().performTest(Scrollbox_text_2VP());
		
		
		//Click on button
		
		button_submit().click();
		
		//Click on Image button
		button_bridge1().click();
		
		//Click on checkbox & Verify the state
		
		
		checkBox_vehicleBike().click();
		
		checkBox_vehicleBike().performTest(vehicleBike_stateVP());
		
		//ClickToState on checkbox  & Verify the State
		
		checkBox_vehicleBike().clickToState(NOT_SELECTED);
		
		checkBox_vehicleBike().performTest(vehicleBike_state_2VP());
		
		//click on radio button & Verify the state
		
		radioButton_nameAndAlt10().click();
		radioButton_nameAndAlt10().performTest(nameAndAlt10_stateVP());
	
		//ClickToState on radio button & Verify the state
		
		radioButton_nametest6().clickToState(SELECTED);
		radioButton_nametest6().performTest(nametest6_stateVP());
		

		// Click on Combo box
	
		
		list_age().click();
		
		
		
		//Click(atText) on combo box & Verify the text selected
		
		list_age().click(atText("Child"));
		
		
		list_age().performTest(Age_selectedVP());
		
		
		
		//Select(Index) on combo box
		
		list_age().select(1);
		
		
		list_age().performTest(Age_selected_2VP());
		
		
		
		//Select(String) on combo box
		
		
		
		list_gender().select("Male");
		
		
		
		list_gender().performTest(Gender_selectedVP());
		
		
		
		//getSelectedText() from a combo box
		
		String text_Selected= list_gender().getSelectedText();
		
		logInfo("Selected text in the combo box is " +text_Selected);
		
		
		//Click on a Link & Verify the text
		
		link__99().click();
		
		document_idTestPage().performTest(IDTestPage_standardVP());
		
		browser_htmlBrowser().back();
				
		//Click on a Link with Image
				
		image_offer().click();
		
		document_hrefimgTestPage().performTest(HREFIMGTestPage_standardVP());
		
		browser_htmlBrowser().back();
		
		//Click on List Box & Verify the text
		
		list_event().click(atText("Anniversary"));
		
		list_event().performTest(Event_selectedVP());
		
		//Select from Listbox and verify the text
		
		list_price().select("$501 - $1000");
		
		
		list_price().performTest(Price_selectedVP());
		
		browser_htmlBrowser().close();
		
		
		}
}

