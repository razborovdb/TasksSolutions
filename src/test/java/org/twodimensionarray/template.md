Description
Added to schema.sql SQL queries to migrate tables: children, parents, feedback_badges, student_badges
Added to data.sql SQL queries to seed tables: children, parents, feedback_badges, student_badges
Created classes Children, Parents, FeedbackBages, StudentBages for tables children, parents, feedback_badges, student_badges
Created interfaces ChildrenRepository, ParentsRepository, FeedbackBagesRepository, StudentBagesRepository
to access data in the tables children, parents, feedback_badges, student_badges
Created test classes MigrationSeedChildrenTest, MigrationSeedParentsTest, MigrationSeedFeedbackBagesTest,
MigrationSeedStudentBagesTest for test migration and seed for the tables children, parents, feedback_badges, student_badges.
Loom Video
https://www.loom.com/share/9dcca8b2399f4ff595ba0f0e2eca5bd2

Type of change
Please delete options that are not relevant.

Bug fix (non-breaking change which fixes an issue)
New feature (non-breaking change which adds functionality)
This change requires a documentation update
Checklist:
My code follows the style guidelines of this project
I have performed a self-review of my own code
I have removed unnecessary comments/console logs from my code
I have made corresponding changes to the documentation if necessary (optional)
My changes generate no new warnings
I have checked my code and corrected any misspellings
No duplicate code left within changed files
Size of pull request kept to a minimum
Pull request description clearly describes changes made & motivations for said changes