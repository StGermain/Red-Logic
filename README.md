# Red Logic
----
The OpenSource alternative to RedPower 2 Logic by Eloraam.


## Description
Red Logic is an opensource RP2 Logic alternative, that is seeking to open up the world of redstone related mods to hopefully main stream the idea. Who knows what amazing things will come from having an opensource base for redstone mods?

## How To Begin Coding
### Obtaining Forge
The first step to get your Forge development environment setup. The first thing you are going to want to do is create a directory to place your environment in (e.g. "C:\forge" or "/home/user/.forge").  
Now, download the [latest] (http://files.minecraftforge.net/minecraftforge/minecraftforge-src-1.4.5-6.4.2.448.zip) Forge source ([adfly] (http://adf.ly/673885/http://files.minecraftforge.net/minecraftforge/minecraftforge-src-1.4.5-6.4.2.448.zip)), and extract to to our working directory.
If your running Windows, simply run "install.cmd", if your on linux, you will need to download Wine with "sudo apt-get install wine" (Ubuntu) if you have not done so already, then run "install.sh".  This script will download MCP and the minecraft clients you will need, as well as run all the necessary decompilation.
### Installing Eclipse and Using Forge
If you have not already, go install eclipse. For Windows users, the link to the Eclipse website is below, for Ubuntu (Linux) users, you know the drill "sudo apt-get install eclipse".  
Now run Eclipse, when it asks you for your workspace, you are going to want to direct it to the eclipse folder in your working directory (e.g. "C:\forge\MCP\eclipse" or "/home/user/.forge/mcp/eclipse"), now click OK.  
In our Project Explorer you should see the source folder called "Minecraft", if you do, your good to go, if not, your a failure at life, go to the Forge Wiki and see if you can't figure out where you went wrong, if all else fails, post in the MCF Topic.
### Downloading the Red Logic Source
Okay, here is where the real fun begins.  To start, you are going to want to install git, for Ubuntu users "sudo apt-get install git", and for Windows, go get the [latest] (http://git-scm.com/download/win) windows binaries.  
Now head to where you are going to keep your projects (e.g. "C:\Users\User\Projects" or "/home/user/Projects") in your command line (windows users, that would be that "cmd" thing you keep using) and type "git clone git://github.com/StGermain/Red-Logic.git". This will create a folder called "Red-Logic" and in it you will find all the source code and images you need to work with.
### Linking Red Logic to the Working Directory
It's time to add Red Logic to Eclipse to be worked it, and it's the easiest thing you will have done do far. All you need to do is open Eclipse, right-click on the Minecraft source folder, and click New -> Folder.  
A GUI should have just popped up, click on "Advanced >>" then select "Link to alternate location" and direct it to the "client" folder of our Red-Logic directory. Were it says "Folder name:" I suggest renaming it with a prefix like "rl\_client" or "redlogic\_client" to keep it from getting confused with other projects. After it is added, left-click on the folder under "Minecraft" and select "Build Path -> Use as Source Folder", this will add it to the working directory. Just repeat for folders "common" and "resources" and your good to go.  
### Why this Setup?
I prefer this setup over the one you will find on the Forge Wiki. It's clean, all my files get saved to their respective directories, and everything is separate and organized.  Of course, you don't have to do it my way, it's just my suggestion.

## Thats Great, but What about CODE?
Please see the WIKI section of this github. There should be some code snip-its in there where I explain all the details of how to understand the code in this repository. As well, I'll be trying to add comments into the code itself with things like "See <filename> for more info on this" or "Wiki <url>" so you don't have to go hunting for more information on that function or class.

## Useful Links
[MCF Topic](http://www.minecraftforum.net/topic/1601571-red-logic/)  
[Forge Wiki] (http://www.minecraftforge.net/wiki/)  
[Forge Downloads] (http://files.minecraftforge.net/)  
[Eclipse IDE] (http://www.eclipse.org/)
