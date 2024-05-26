@echo off
@title RUN MATRIX(GAME)
java -XX:-OmitStackTraceInFastThrow -server -Xms2048m -Xmx4096m -cp bin;data/libs/netty-3.7.0.Final.jar;data/libs/FileStore.jar;data/libs/minifs_v1.jar; com.rs.GameLauncher 1 true false false false
pause