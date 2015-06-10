The following is a summary of everything we'd like to include for BlitzMax programming in Eclipse.

## Builders ##

Default BlitzMax build preferences :
  * BlitzMax location (eg. /Applications/BlitzMax ) - perhaps some defaults for different platforms.
  * Compiler options (for C/C++ files).

The ability to override build settings on a per-project basis. (just like with the JDT).

## Project Management ##

Project types :
  * Application
  * Module - Perhaps supporting a specific module or parent folder (like brl.mod).
  * Quick - This might be nice for quick editing/building of a BlitzMax app. (Just creates a temp .bmx and lets you work with it)

Project templates :
  * Empty project (just an empty default bmx file)
  * Application stub (default bmx file with Graphics call and While Not KeyDown loop)

If we end up using an Ant script for builds, all project templates will create a default Ant script too.

## Debugging ##

Integrated debugger.

Remote debugging using my custom appstub.
It would be nice to be able to set breakpoints rather than hard-code DebugStop everywhere.

Console integration.