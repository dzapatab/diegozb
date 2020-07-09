Feature: I am testing post request for Go Rest API

	@sanity
  Scenario: Post request to create a user in the Go Rest DB
    When I hit the api with post request and end point as "/public-api/users"
    
    Then API created a new User in the system 
    
    And I can find the new user in the system when i get the user with last name "Zapata"