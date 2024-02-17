Feature: Aurora LS Quotes Feature

  #@green
  #Scenario: Searching for 'green'
   # Given Sergey is researching things on the internet
    #When he looks up "green"
    #Then he should see information about "green"
  @CreateLSQuote
  Scenario: Test Create Life Sciences(LS) Quote
    Given Nitin on Aurora Testing
    When He click Quotes Tab
    Then He should Able to click Create New Quotes Button
    Then He Select Client as "SMPL - Myers Inc"
    Then He Select Client contact as "Anurag Wani"
    Then He Select Team as "Testing"
    Then He Enter Bid Description as "LS Quote Created By Nitin"
    Then He Select Quote format as "Life Sciences"
    Then He Select RWS Quote Contact as "Nitin Magar"
    Then He Click Create New Quote form Button
    Then He Click Edit Details Button
    Then He Select Quote type as "Default Scenario"
    Then He Select Estimated Launch Date
    Then He Select Requested Project Delivery Date
    Then He Select Expected Revenue Recognition Date
    Then He Click Save Button

  Scenario: breakdown
    Given Nitin on Aurora Testing
    When He click Quotes Tab
    Then He should Able to click First existing quote
    Then He Click Breakdown Tab
    Then He Click ComponenetInstrument Button
    Then He Enter Component as "Inst-1"
    Then He Click Save Component Button
    Then He Click Lang. pair Button
    Then He Select Language Pair as "English -> French (France)"
    Then He Select Component as "Inst-1"
    Then He Click Save Lang. Pair Button
    Then He Click Line item Button
    Then He Select Type as "DTP"
    Then He Select Service Item as "Format Only"
    Then He Enter Word quantity as "678"
    Then He Click Save And Close Button
    Then He Click Discount Button
    Then He Enter Discount amount as "10"
    Then He Click % radio Button
    Then He Click Add Discount Button
    Then He Click Edit Mode Button
    Then He Click Expand Breakdown
    Then He Enter Rate as "2.01"
    Then He Click Save Button after edit




