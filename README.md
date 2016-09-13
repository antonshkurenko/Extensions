# Extensions

## Prehistory
One day I had to add home arrow button to every activity and thought about making a `ToolbarActivity`. Later I had to add broadcast receiver to some of them. I decided to subclass `ToolbarActivity` to `ToolbarBroadcastReceiverActivity`.  

And more and more and more...

To `OtherStuffAndEvenMoreStuffToolbarBroadcastReceiverActivity`

But...
One day, Gang of Four caught my eye.

## About

I thought about *Decorator* pattern, but for real it's *Strategy*.

Here I name it "Extension".

The main idea is to extract repeatable code to the other files and add them as simple modules. Like [this](https://github.com/eyeem/decorator) but much, much, much simplier.

[decorators](https://github.com/tonyshkurenko/Extensions/tree/master/decorators/src/main/java/io/github/tonyshkurenko/extensions) folder contains something like library with basic classes.

[app](https://github.com/tonyshkurenko/Extensions/tree/master/app/src/main/java/io/github/tonyshkurenko/decoratortest) folder contains example

I created this repo to ask you:

## Questions

1) Does it make sense?  
2) Maybe you know better or existing solution to do this?
