#JavaGrowl
Here is a really simple library to send notifications to [Growl](http://growl.info) from any Java program.

This implementation is originally based on the Growl Jenkins plugin and uses the network feature provided by Growl to publish notifications.

##Configure
Under OS X preferences, go to the Growl options and then activate the network feature. Set a passwork in the server password text field if necessary. This password will be required in the Java code.

<img src="http://f.cl.ly/items/1j0G1a2S3G2e1n1p0m2N/growl-network.png"/>

##Code
Using JavaGrowl is quite simple, once you have activated the network feature in Growl, you can use it like this:

[[gist.github.com/1178562]]
