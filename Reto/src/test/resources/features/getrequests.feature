@api @get
Feature: I am testing get request for Go Rest API
	@sanity

   Scenario: Get request to fetch single User
    Given Go rest API is up and running
    When I hit the api with get request and end point as "/public-api/users/49766"
    Then API should return user details of user id "49766"
