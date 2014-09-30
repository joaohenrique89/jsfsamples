How to run samples
==========

Download and Install Last Version of JDK 7

Link http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html


==========

Download Eclipse

Link https://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/marsm1


==========


Download and install LOMBOK
Install Lombok.jar on Eclipse by double clicking it and informing the Eclipse directory in the window that will appear. 

Link  http://projectlombok.org/

==========

Download JBoss AS 7.1.1.Final and extract it on a directory

Link http://jbossas.jboss.org/downloads.html

==========

Install JBoss 7 in Eclipse 
In Eclipse, open the Server View. To do it, go to Window -> Show View -> Servers. In this view, click on "Click this link to create a new server", after select JBoss AS 7.1 and configure the server runtime environment to point to the JBoss folder that you extracted. Hit finish.

PS.: If the JBoss AS 7.1 does not appear in the list of server, click the link "Download additional server adapters" and install the JBoss adapter.

==========

At this moment, you should see JBoss Server in the Servers View, saying “[Stopped, Republish]”. 

==========

Now you can import the examples into Eclipse, to do so, click File -> Import -> Maven -> Existing Maven Project and navigate to the jsfSamples file. Select all three projet that should appear and click next, next, next... and next. :)

==========

Now you should be able to right click JBoss and select "Add and Remove" and add the two projet to JBoss.

==========

Next thing, start JBoss and test it. 
