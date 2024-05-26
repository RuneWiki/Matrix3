@echo off
@title RUN MATRIX(LOGIN)
java -XX:-OmitStackTraceInFastThrow -server -cp bin;data/libs/netty-3.7.0.Final.jar;data/libs/FileStore.jar;data/libs/minifs_v1.jar; com.rs.LoginLauncher true false
pause