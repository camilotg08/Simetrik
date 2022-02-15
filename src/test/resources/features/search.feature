#Autor: camilotg08@gmail.com
Feature: As a user I want search Simtrik on the webpage www.google.com

  Background:
    Given that I am in the webpage

    @SearchSuccessfully
    Scenario: Search on the webpage
      When the search engine give me results
      Then the results are different from 0