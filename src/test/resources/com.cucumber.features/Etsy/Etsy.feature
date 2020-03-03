Feature: validation in Etsy

  Background:
    Given user loges in to etsy.com

  Scenario: validation of wooden spoon
    When search for "Wooden spoon"
    Then validate title is "Wooden spoon | Etsy"

  Scenario: validation of make up organizer
    When search for "make up organizer"
    Then validate title is "Make up organizer | Etsy"