These are the current requirements if you want to build EclipseMax from source :

  * Minimum Java 5 SDK
  * [Eclipse Galileo](http://www.eclipse.org/downloads/packages/eclipse-rcpplug-developers/galileor) - The version for Eclipse for RCP/Plug-in Developers
  * DLTK and dependencies - [(1.0 Download page)](http://download.eclipse.org/technology/dltk/downloads/drops/R1.0/R-1.0-200906171219/) - This page lists some of the projects required, with download links. Most notably for us are :
    * [DLTK Core Framework (SDK)](http://www.eclipse.org/downloads/download.php?file=/technology/dltk/downloads/drops/R1.0/R-1.0-200906171219/dltk-core-sdk-R-1.0-200906171219.zip) (zip)
    * [EMF](http://www.eclipse.org/downloads/download.php?file=/modeling/emf/emf/downloads/drops/2.5.0/S200906151043/emf-runtime-2.5.0RC5.zip) (zip)

  * [Subclipse 1.6.2.1](http://subclipse.tigris.org/files/documents/906/46155/site-1.6.2.1.zip) (zip) - This enable access to the subversion repository through Eclipse.

## Eclipse Installation ##

Unzip Eclipse. It will create an `eclipse` folder, containing the executable, features and plug-ins folders.

Extract DLTK. On Windows you can extract it into the same folder as your `eclipse` folder, which will automatically extract the files into the correct folders inside eclipse. On other platforms you may need to copy the contents of both features and plugins folders into the relevant folders in eclipse.

Follow the same process for EMF as above.

To install the subclipse distribution you can follow the same procedure as above.

## EclipseMax Source Installation ##

You'll find the Subversion URL on the [Source](http://code.google.com/p/eclipsemax/source/checkout) page.
There are currently 6 Eclipse projects in trunk :
  * net.brucey.dltk.blitzmax.core - the core plug-in, including the parser.
  * net.brucey.dltk.blitzmax.debug
  * net.brucey.dltk.blitzmax.debug.ui - the user interface code for debugging and launching
  * net.brucey.dltk.blitzmax.debugger - the backend debugging interface
  * net.brucey.dltk.blitzmax.launching - the backend for launching
  * net.brucey.dltk.blitzmax.ui - the user-interface plug-in, preferences, etc.

You should check these out as individual projects into Eclipse.

All going well, they should build automatically without errors.

### Testing the plugin ###
Once they are in Eclipse, and assuming there are no compilation errors, you can try running the plugin inside a "test" Eclipse Application :

Right-click on one of of the projects, and choose Run As -> Eclipse Application.

This should launch a new Eclipse with the new plugin installed and ready to use. From there, you should be able to create a new BlitzMax Project, and subsequently create a new .bmx file.

## Handy Extras ##

[ANTLRWorks](http://www.antlr.org/works/index.html) - A GUI editor for ANTLR grammars.
This I highly recommend if you are going to be looking at the BlitzMax grammar. It makes life so much easier.

[ANTLR IDE](http://antlrv3ide.sourceforge.net/) - An Eclipse plugin for ANTLR development.  It doesn't seem to play nicely with the DLTK plugins though so you may want to run it in a separate install of Eclipse.