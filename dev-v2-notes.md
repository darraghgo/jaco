## Loads to do

Root level changed from info to all

        <Root level="all">
        
        		<!-- Sent all types of log messages to the console window -->
            <AppenderRef ref="STDOUT" />
            
            <!-- Example of a basic log all appender that writes to the same file all the time -->
            <!--  This appender definition creates a single file that keeps getting appended to - can get too big, so commented out
            	<AppenderRef ref="LOGFILE"/>
            -->
            
            <!-- Example of a basic rolling log appender that writes to the a different file each day -->
            <!-- Each day a new logfile is created and the old one backed up with the previous date appended - logs all levels
            <AppenderRef ref="ROLLINGLOGFILE"/>
            -->
            
        </Root>