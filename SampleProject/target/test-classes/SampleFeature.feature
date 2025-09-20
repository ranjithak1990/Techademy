Feature: FaceBook Login check  
  Scenario Outline: Facebook Login
    Given Launch the brower
    When Enter the "<UserName>" and "<Password>"
    When Click On Submit button
    Then Close the brower

    Examples: 
      | UserName | Password | 
      | Ranjitha |     abcde | 
     
