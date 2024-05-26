# Matrix 3

This is a fairly old source now (posted in 2016, work from 2013-2015) but people still use it - here it is mirrored and using gradle for project management.

Source and credits: https://rune-server.org/runescape-development/rs-503-client-and-server/downloads/618618-matrix-3-official-release-recommended-rs3-download-830-a.html

Compatible OpenRS2 cache: https://archive.openrs2.org/caches/runescape/484

## Running the server

Make sure you open the server and the client folder in separate IntelliJ windows. They are separate projects.

I kept the old batch scripts so they still work if you prefer that approach.

If you want to launch through IntelliJ, add a few run configurations using Gradle as the target:  
`runGame`: Start the game server  
`runLogin`: Start the login server  

## Running the client

**You don't have to run IntelliJ to start the client if you just want to play.**

I kept the old batch script, use that if you prefer that approach or don't need to make any client changes.

If you want to launch through IntelliJ, add a run configuration using Gradle as the target:  
`run`: Start the client
