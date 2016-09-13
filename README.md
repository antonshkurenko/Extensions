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

The main idea is to extract repeatable code to the other files and add them as simple modules.

I created this repo to ask you:

## Questions

1) Does it make sence?  
2) Maybe you know better or existing solution to do this?
