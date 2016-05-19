In this homework, we were working in teams of 2 people.
We built an application that simulates the registration process that all
students go through at the beginning of each semester. We modeled each student as a separate
thread, and started the threads to see how they progress.
----------------------------------------------------------------------------------------------
In order to register, each student is supposed to take the following steps:
1. Go to the department laboratory and find an available computer (if necessary, wait until a
computer becomes available)
2. Randomly take 3 distinct courses
3. Visit her/his advisor and ask the advisor to check the courses
4. If the advisor approves all courses, then go and join the after-registration party
5. If the advisor does not approve the courses, go to step 1 and redo everything again
6. Once all students finish registration, the party starts, and everyone starts chatting
Each student is either a BS student, or an MS student or a PhD student. Similarly each course
has an associated level (BS, MS or PhD). When the students visit their advisors, the advisors
suggest BS students not to take PhD level courses (since it might be too advanced), and they
also suggest PhD students not to take BS level courses (since it would be less useful). If any of
the courses taken by a student is not approved by the advisor, the student needs to randomly take
3 courses and come back for approval again.
