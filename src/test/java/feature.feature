Feature: Demo Web Page
  Scenario: User enter DemoWeb Page Loggin
    Given user enter web page
    And user verify title
    And user click the register link
    And user select gender
    And users enter below informations
    |firstname|lastname|email|password|confrim|
    |Selen    |Dilek   |yildirimselen17@gmail.com|0123S.|0123S.|
    |Ahmet    |Alica   |ahmetalica02@gmail.com|0123S.|0123S.|
    |Mehmet   |Yilmaz   |mehmetyilmaz003@gmail.com|0123S.|0123S.|

    Then close the aweb page