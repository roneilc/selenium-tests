package com.wikia.webdriver.testcases.globalnavigationbar;

import com.wikia.webdriver.common.core.Assertion;
import com.wikia.webdriver.common.core.configuration.EnvType;
import com.wikia.webdriver.common.templates.NewTestTemplate;
import com.wikia.webdriver.pageobjectsfactory.pageobject.HomePage;

import org.testng.annotations.Test;

@Test(groups = {"globalnavigationbar", "globalnavigationbarNavigating"})
public class Navigating extends NewTestTemplate {

  @Test(groups = {"fandomLogoClickOnEnCommunityOpensFandomWikia"})
  public void logoClickOnEnglishCommunityOpensFandom() {
    new HomePage()
        .getGlobalNavigation()
        .clickFandomLogo();

    Assertion.assertEquals(driver.getCurrentUrl(), fandomUrlBuilder.getFandomUrl(EnvType.PROD));
  }

  @Test(groups = {"gamesHubLinkClickOnEnCommunityOpensGamesHub"})
  public void testGamesHubLink() {
    new HomePage()
        .getGlobalNavigation()
        .clickGamesHubLink();

    Assertion.assertEquals(driver.getCurrentUrl(), fandomUrlBuilder.getFandomUrl(EnvType.PROD) + "topics/games");
  }

  @Test(groups = {"moviesHubLinkClickOnEnCommunityOpensMoviesHub"})
  public void testMoviesHubLink() {
    new HomePage()
        .getGlobalNavigation()
        .clickMoviesHubLink();

    Assertion.assertEquals(driver.getCurrentUrl(), fandomUrlBuilder.getFandomUrl(EnvType.PROD) + "topics/movies");
  }

  @Test(groups = {"tvHubLinkClickOnEnCommunityOpensTvHub"})
  public void testTVHubLink() {
    new HomePage()
        .getGlobalNavigation()
        .clickTVHubLink();

    Assertion.assertEquals(driver.getCurrentUrl(), fandomUrlBuilder.getFandomUrl(EnvType.PROD) + "topics/tv");
  }


  @Test(groups = {"exploreWikisLinkClickOnEnCommunityOpensExplorePage"})
  public void testExploreWikisLink() {
    new HomePage()
        .getGlobalNavigation()
        .openWikisMenu()
        .clickExploreWikisLink();

    Assertion.assertEquals(driver.getCurrentUrl(), fandomUrlBuilder.getFandomUrl(EnvType.PROD) + "explore");
  }

}
