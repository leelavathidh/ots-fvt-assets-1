
import resources.FT_HTMLTest_Shared_DatasetHelper;
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
 * @author Administrator
 */
public class FT_HTMLTest_Shared_Dataset extends FT_HTMLTest_Shared_DatasetHelper
{
	/**
	 * Script Name   : <b>FT_HTMLTest_Shared_Dataset</b>
	 * Generated     : <b>Apr 14, 2020 9:53:30 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 18363 ()
	 * 
	 * @since  2020/04/14
	 * @author Administrator
	 */
	public void testMain(Object[] args) 
	{
		startBrowser("firefox","http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm");
		
		// HTML Browser
		// Document: Contest page: http://civcez229.nonprod.hclpnp.com/aries-web/samples/visionofficeproducts/contest.htm
		text_name().click(atPoint(94,16));
		browser_htmlBrowser(document_contestPage(),DEFAULT_FLAGS).inputChars("test");
		// Data Driven Code inserted on Apr 14, 2020
		
		text_name().setText(dpString("Name"));
		text_address().setText(dpString("address"));
		text_city().setText(dpString("City"));
		text_state().setText(dpString("State"));
		text_zip().setText(dpString("Zip"));
		text_email().setText(dpString("email"));
		//list_position().select(dpString("position"));
		//list_salary().select(dpString("salary"));
		text_buyerDescription().setText(dpString("buyerDescription"));
		radioButton_buyerno().click();
		browser_htmlBrowser(document_contestPage(),DEFAULT_FLAGS).close();
		
	}
}

