package DoJo;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.selectsObjectsOfDoJo;
import resources.base;

public class DoJoApplication extends base {
	@Test
	public void ProgrammaticNestedTabs() throws IOException, InterruptedException {
		driver = initializeDriver();
		selectsObjectsOfDoJo sobj = new selectsObjectsOfDoJo(driver);
		sobj.runButton().click();
		Thread.sleep(5000);
		// Click on tab2
		driver.switchTo().frame(0);
		sobj.tab2().click();
		// my 4th inner
		sobj.my4thInnerTab().click();
		// Validate the text displayed within the tab
		String labeltextof4thinner = sobj.my4thInnerTab().getText();
		Assert.assertEquals(labeltextof4thinner, "My 4th inner");
		System.out.println(sobj.my4thInnerText().getText());
		String innertextof4th = sobj.my4thInnerText().getText();
		Assert.assertEquals(innertextof4th, "Fusce sed orci magna, vitae aliquet quam");
		// Click “Tab 1”
		sobj.tab1().click();
		// Validate the text
		String tab1text = sobj.tab1Text().getText();
		System.out.println(tab1text);
		Assert.assertEquals(tab1text, "Lorem ipsum dolor sit amet");

		// Click “My 2nd Inner” Tab
		sobj.my2ndInnerTab().click();
		// validate text
		String innertextofmy2nd = sobj.my2ndInnerText().getText();
		System.out.println(innertextofmy2nd);
		Assert.assertEquals(innertextofmy2nd, "Consectetur adipiscing elit");

		// Click Tab 2
		sobj.tab2().click();
		// Click My 3rd inner
		sobj.my3rdInnerTab().click();
		// Validate text
		String innertextofmy3rd = sobj.my3rdInnerText().getText();
		System.out.println(innertextofmy3rd);
		Assert.assertEquals(innertextofmy3rd, "Vivamus orci massa rhoncus a lacinia");

		// Click Tab 3
		sobj.tab3().click();
		// Validate the text

		String tab2text = sobj.tab2Text().getText();
		System.out.println(tab2text);
		Assert.assertEquals(tab2text, "No sub tabs");

		tearDown();

	}
}
