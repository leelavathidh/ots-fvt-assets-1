
import resources.iFrame_HTML_PlaybackConvergenceHelper;
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
public class iFrame_HTML_PlaybackConvergence extends iFrame_HTML_PlaybackConvergenceHelper
{
	/**
	 * Script Name   : <b>iFrame_HTML_PlaybackConvergence</b>
	 * Generated     : <b>04-Jun-2019 3:28:59 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2019/06/04
	 * @author SRAVANKUMARREDDY.K
	 */
	public void testMain(Object[] args) 
	{
		startBrowser("chrome", "http://civcez229.nonprod.hclpnp.com/aries-web/Samples/AllControls/iFrames/All%20Control%20Sample%20-%20iFrame.html");
		
		sleep(5);
		browser_htmlBrowser().maximize();
		
		//Inside Iframe click at point on edit box
		
		//inputchars & Verify text
		text__1linebox().click(atPoint(92,15));
		browser_htmlBrowser(document_iFramesWithAllHTMLCon(),DEFAULT_FLAGS).inputChars("Verify_IFrame_Test");
		text__1linebox().performTest(_1linebox_textVP());
		
		//Inside frame click on edit box
		//input keys & verify the text
		
		text__1linebox1().click();
		browser_htmlBrowser(document_iFramesWithAllHTMLCon(),DEFAULT_FLAGS).inputKeys("Verify Click Test");
		text__1linebox1().performTest(_1linebox1_textVP());
		
		//set text & verify the text
		sleep(1);
		text__1linebox1().setText("This text is set by settext method");
		text__1linebox1().performTest(_1linebox1_text_2VP());
		
		// Inside frame Click at point on scrolling text box 
		// input keys, input chars & Verify the text
		
		
		text_scrollbox().click(atPoint(112,17));
		browser_htmlBrowser(document_iFramesWithAllHTMLCon(),DEFAULT_FLAGS).inputKeys("This is scrolling test{ENTER}");
		browser_htmlBrowser(document_iFramesWithAllHTMLCon(),DEFAULT_FLAGS).inputChars("second line");
		text_scrollbox().performTest(Scrollbox_textVP());
		
		// set text & verify the text on the scroll box
		
		text_scrollbox().setText("This text is entered by set text method");
		
		text_scrollbox().performTest(Scrollbox_text_2VP());
		
		//Click on button
		
		button_submit().click();
		
		//Click on image button
		
		button_bridge1().click();
		
		//Click on checkbox & Verify the state
		
		checkBox_vehicleBike().click();
		checkBox_vehicleBike().performTest(vehicleBike_stateVP());
		
		//ClickToState on checkbox  & Verify the State
		
		checkBox_vehicleBike().clickToState(NOT_SELECTED);
		
		checkBox_vehicleBike().performTest(vehicleBike_state_2VP());
		
		//Click on radio button & Verify the state
		
		radioButton_nameAndAlt10().click();
		radioButton_nameAndAlt10().performTest(nameAndAlt10_stateVP());
		
		//ClickToState on radio button  & Verify the State
		
		
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
		
		
		
		//Click on Link & Verify the text
		
		
		link__99().click();
		
		document_idTestPage().performTest(IDTestPage_standardVP());
		
		browser_htmlBrowser().back();
		
		//Click on image link & verify the text
		
		
		image_offer().click();

		document_hrefimgTestPage().performTest(HREFIMGTestPage_standardVP());
		
		browser_htmlBrowser().back();
		
		
		//Click on List Box & Verify the text
		
		
		list_event().click(atText("Anniversary"));
		
		list_event().performTest(Event_selectedVP());
		
		//Select from Listbox and verify the text
		
		list_price().select("$21 - $35");
		list_price().performTest(Price_selectedVP());
		
		
		browser_htmlBrowser().close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

