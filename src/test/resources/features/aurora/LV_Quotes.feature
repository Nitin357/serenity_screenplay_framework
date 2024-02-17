Feature: Aurora LV Quotes Feature

  @CreateLVQuote
  Scenario: Test Create Linguistic Validation(LV) Quote
    Given Nitin on Aurora Testing
    When he click Quotes Tab
    Then he should Able to click Create New Quotes Button
    Then he Select Client as "SMPL - Myers Inc"
    Then he Select Client contact as "Anurag Wani"
    Then he Select Team as "Testing"
    Then he Enter Bid Description as "LV Quote Created By Nitin"
    Then he Select Quote format as "Linguistic Validation"
    Then he Select RWS Quote Contact as "Nitin Magar"
    Then he Click Create New Quote form Button


