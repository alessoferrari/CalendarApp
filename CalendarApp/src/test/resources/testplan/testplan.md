#Use Case: Create Conference Link
##Preconditions:
- The user selects the conference link menu.
  Invariants:
- The terminal is not closed
##Postconditions:
- A new conference link is created.
##Steps:
1. The user enters CONFERENCELINKS.
2. The user enters CREATE
3. The user enters an event id
4. The software creates and displays a conference link

#Use Case: Return A Conference Link That Was Already Created
##Preconditions:
- TODO: Fill in preconditions
- The user selects the conference link menu.
- Invariants: event ID already created
##Postconditions:
- TODO: Fill in postconditions
- user can not create a new conference link, conference link already created
##Steps:
- TODO: Fill in steps
- 1. The user enters CONFERENCELINKS.
2. The user enters CREATE
3. The user enters an event id
4. The software replies that conference link is already created and throws exception


#Use Case: Delete A Conference Link That Was Already Created
##Preconditions:
- TODO: Fill in preconditions
- The user enters delete to remove the conference link menu.
- Invariants: event ID already created
##Postconditions:
- TODO: Fill in postconditions
- user deletes conference link that was already created
##Steps:
- TODO: Fill in steps
- 1. The user enters CONFERENCELINKS.
2. The user enters DELETE
3. The user enters an event id
4. The software Deletes the conference link


#Use Case: Create A Conference Link for a Non-Existent Event
##Preconditions:
- TODO: Fill in preconditions
- The user selects the conference link menu
- invariants:
- user enters wrong event ID number
##Postconditions:
- TODO: Fill in postconditions
- user can not create a new conference link, event ID does not exist, throws exception
##Steps:
- TODO: Fill in steps
- 1. The user enters CONFERENCELINKS.
2. The user enters CREATE
3. The user enters an event id
4. The software can not create a new conference link, event ID does not exist, throws exception



#Use Case: Get A Conference Link for a Non-Existent Event
##Preconditions:
- TODO: Fill in preconditions
- - The user selects the conference link menu
- Enters GET to retrieve event conference link.
- invariants:
- user enters event id that does not exist
##Postconditions:
- TODO: Fill in postconditions
- program sends back Conference link does not exist and asks them ro retype a command
##Steps:
- TODO: Fill in steps
-  1. The user enters CONFERENCELINKS.
2. The user enters GET
3. The user enters an event id that does not exist
4. The software can not retrieve a conference link, event ID does not exist, throws exception


#Use Case: Join A Conference Link for a Non-Existent Event
- TODO: Fill in preconditions
- - The user selects the conference link menu
- Enters join to join the event conference 
- invariants:
- user enters event id that does not exist
  ##Postconditions:
- TODO: Fill in postconditions
- program sends back Conference link does not exist and asks them ro retype a command
  ##Steps:
- TODO: Fill in steps
-  1. The user enters CONFERENCELINKS.
2. The user enters Join
3. The user enters an event id that does not exist
4. The software can not retrieve a conference link, event ID does not exist, throws exception

#Use Case: Get A Conference Link for a Non-Existent Conference Link
- TODO: Fill in preconditions
- - The user selects the conference link menu
- Enters GET to retrieve event conference link.
- invariants:
- user enters event id that does not exist
  ##Postconditions:
- TODO: Fill in postconditions
- program sends back Conference link does not exist and asks them ro retype a command
  ##Steps:
- TODO: Fill in steps
-  1. The user enters CONFERENCELINKS.
2. The user enters GET
3. The user enters an event id that does not exist
4. The software can not retrieve a conference link, event ID does not exist, throws exception

#Use Case: Join A Conference Link for a Non-Existent Conference Link
- TODO: Fill in preconditions
- - The user selects the conference link menu
- Enters join to join the event conference
- invariants:
- user enters event id that does not exist
  ##Postconditions:
- TODO: Fill in postconditions
- program sends back Conference link does not exist and asks them ro retype a command
  ##Steps:
- TODO: Fill in steps
-  1. The user enters CONFERENCELINKS.
2. The user enters Join
3. The user enters an event id that does not exist
4. The software can not retrieve a conference link, event ID does not exist, throws exception