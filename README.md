# Instructions
## Requirements
- JDK 1.8.0_25
- maven 3.2.1
- git client

## To Install
- Clone the repository
> git clone https://github.com/ferzac/scopeapp-jz

## To run
- Compile the code
> mvn clean install

   **Note**: To run just the Junit test use the command.
 > mvn test
- Go to **target** folder
- Using java command execute the file scopeapp-jz.jar
```
$> java -jar scopeapp-jz.jar 1 10 
```

## Parameters
The JAR requires 2 parameters to work
```
 scopeapp-jz.jar <1|2> <height>
```
- First (Mandatory). Indicate what kind of program will be run
  - 1 = Draw a Christmas Tree
  - 2 = Draw a X
- Second (optional). Determines the height of the draw if it is not present the program will use a default value. 
