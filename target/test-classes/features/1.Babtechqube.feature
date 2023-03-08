@test1
Feature: Homepage menus of Babtecqube

  Background:
    Given The user navigates to the home page


  Scenario Outline: Verify that the user should be able to navigate to the related menus by clicking the buttons on the Homepage
    When The user clicks the "<menus>" menu
    Then The user should see the "<urls>" text

    Examples:
      | menus         | urls                                                                    |
      | Prices        | https://www.babtecqube.com/en/prices                                    |
      | Media Library | https://www.babtecqube.com/en/media-library                             |
      | FAQ           | https://www.babtecqube.com/en/faq                                       |
      | Our Promise   | https://www.babtecqube.com/en/our-promise                               |
      | Contact       | https://www.babtecqube.com/kontakt                                      |
      | Registration  | https://login.babtecqube.com/account/register?origin=babtecqube&lang=en |
      | Login         | https://login.babtecqube.com/?origin=babtecqube&lang=en                 |


  Scenario Outline: Verify that the user should be able to navigate to the related menus by clicking the Solutions button
    When The user clicks on the "Solutions" menu
    When The user clicks the "<sub menus>" menu under Solutions main menu
    Then The user should see the "<sub menus names>" text of sub menu name

    Examples:
      | sub menus                      | sub menus names                 |
      | Equipment & Gages              | Equipment Management            |
      | Tasks & Actions                | Action Management               |
      | For BabtecQ users              | The platform for BabtecQ users  |
      | Goods Inspections & Checklists | Goods Inspections                |
      | Analyses                       | Analyses of Quality Key Figures |
      | Complaints & Deviations        | Complaints Management           |
      | Microsoft Teams                | BabtecQube for Microsoft Teams  |

