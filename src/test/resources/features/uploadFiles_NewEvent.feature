Feature: User should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from Bixtrix24, and create files to upload

  Background: User goes to Bixtrix24 home page
    Given User log in with valid credentials and see the home page
    When  User clicks on Event

  @koala
  Scenario: User should be able to click on upload files icon to upload files and pictures from local disks
    And  User clicks on upload files icon
    And  User clicks on Upload files and Images
    Then User should be able to select a file or picture from a local disk
    Then User tap a file name and click ok