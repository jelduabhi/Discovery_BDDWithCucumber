Feature: AfterCutOff feature

  @Sample 
  Scenario: Validate videos
  Given i launch application with valid url
  When i navigate to my videos and add two videos into my favourite
  Then i can able to see favourite in My Vidoes section
  
