package day03_Git_and_GitHub_Setup_for_Java_Projects;
// https://youtu.be/pmiIhgG08pQ?si=o0yPB7fy-qUUPJX4
public class notes {
/* 
 * Open terminal with windows key + r and enter "cmd" into the prompt
 * 
 * differences for windows terminal:
 * -   [ pwd ]   is unneeded, cd already takes care of that too in windows terminal
 * -   [ clear ]  is   [ cls ]
 * -   [ ls - a ]   is   [ dir /a ]
 * -   I couldn't figure out how to copy and paste the whole .git ignore file without it taking it as a bunch of commands, so I just made the file myself from file explorer
 * -   [ less .gitignore ]   is   [ more .gitignore ]   and then you have to hold enter until the rest of the file is printed out.
 * 
 * get to the file directory you want to make your repository using the [ cd ] command and then use the [ git init ] command to
 * create the repository. a workspace file is a good level to set a repository at
 * 
 * you can use [ dc .. ] to go up the file directory to the parent file, or [ cd ] and the name of a child file to go to it
 * 
 * use dir a/ to view the files in that directory
 * 
 * create a .gitignore file to clear out junk files you don't want and leave only the project folders
 * 
 * use [ git status ] to see what will be committed to the repository
 * 
 * use [ git add . ] to add or update all files to the repository and use [ git add ] plus name of file and it's directory to add
 * or update just the file and all children files to the repository
 * 
 * use [ git rm -f ] plus the file and it's directory from the workspace folder to remove a file folder/folder/folder/file from
 * the repository
 * 
 * use [ git rm -r ] plus the file to delete it completely
 * 
 * use [ got commit - m "name of commit" ] to name the commit
 * 
 * use [ git log ] to view commit details
 * 
 * use [ git config --global --edit ] to open config file to edit it and update info like email or author name
 * then [ git commit --amend --reset-author "name" ] to update the authors name for this commit
 * 
 * use [ git push origin master ] to finally upload the commit to gitHub
 * 
 * to assign a repository on your computer to a repository on gitHub, just follow the instructions on gitHub in the terminal
 * the directory the repository is in open in terminal
 * 
 * 
 */
}
