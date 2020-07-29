Feature:Serve Coffee
Coffee should not be served until paid for
Coffee should not be served until the button has been pressed
If there is no coffee left, then the money should be refunded

Scenario: Buy Last Coffee
  Given There are 1 Coffee left in the Machine
  And I have deposited $5
  And I previously have $100 in the bank
  When I press the coffee button
  Then I should be served a coffee

Scenario: Buy Coffee when no coffee are available
  Given There are 0 Coffees left in the Machine
  And I have deposited $5
  And I previously have $100 in the bank
  When I press the coffee button
  Then I should not be served a coffee		
  Then I should be refunded my $5
 
