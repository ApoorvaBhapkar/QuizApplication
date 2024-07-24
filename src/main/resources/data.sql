-- CREATE TABLE IF NOT EXISTS public.Question
-- (
--     id SERIAL PRIMARY KEY,
--     category VARCHAR NOT NULL,
--     difficulty_level VARCHAR NOT NULL,
--     option1 VARCHAR NOT NULL,
--     option2 VARCHAR NOT NULL,
--     option3 VARCHAR NOT NULL,
--     option4 VARCHAR NOT NULL,
--     right_answer VARCHAR NOT NULL,
--     question_title VARCHAR NOT NULL
-- );

-- ALTER TABLE IF EXISTS public.Question
--     OWNER to postgres;


-- INSERT INTO public.Question (id, category, difficulty_level, option1, option2, option3, option4, right_answer, question_title)
-- VALUES 
-- (1, 'Science', 'Easy', 'Mercury', 'Venus', 'Earth', 'Mars', 'Earth', 'Which planet is known as the Blue Planet?');

-- INSERT INTO public.Question (id, category, difficulty_level, option1, option2, option3, option4, right_answer, question_title)
-- VALUES 
-- (2, 'History', 'Medium', 'George Washington', 'Thomas Jefferson', 'Abraham Lincoln', 'John Adams', 'George Washington', 'Who was the first President of the United States?');

-- INSERT INTO public.Question (id, category, difficulty_level, option1, option2, option3, option4, right_answer, question_title)
-- VALUES 
-- (3, 'Math', 'Hard', '3', '4', '5', '6', '4', 'What is the square root of 16?');

-- INSERT INTO public.Question (id, category, difficulty_level, option1, option2, option3, option4, right_answer, question_title)
-- VALUES 
-- (4, 'Geography', 'Easy', 'Asia', 'Africa', 'North America', 'Europe', 'Asia', 'Which is the largest continent?');

-- INSERT INTO public.Question (id, category, difficulty_level, option1, option2, option3, option4, right_answer, question_title)
-- VALUES 
-- (5, 'Literature', 'Medium', 'J.K. Rowling', 'George Orwell', 'William Shakespeare', 'Mark Twain', 'William Shakespeare', 'Who wrote "Hamlet"?');

-- INSERT INTO public.Question (id, category, difficulty_level, option1, option2, option3, option4, right_answer, question_title)
-- VALUES 
-- (6, 'Science', 'Hard', 'Proton', 'Electron', 'Neutron', 'Photon', 'Photon', 'Which particle is known as the quantum of light?');

-- INSERT INTO public.Question (id, category, difficulty_level, option1, option2, option3, option4, right_answer, question_title)
-- VALUES 
-- (7, 'History', 'Easy', '1945', '1939', '1914', '1918', '1945', 'In which year did World War II end?');

-- INSERT INTO public.Question (id, category, difficulty_level, option1, option2, option3, option4, right_answer, question_title)
-- VALUES 
-- (8, 'Math', 'Medium', 'π', 'e', 'i', '√2', 'π', 'Which symbol is used to represent the mathematical constant Pi?');

-- INSERT INTO public.Question (id, category, difficulty_level, option1, option2, option3, option4, right_answer, question_title)
-- VALUES 
-- (9, 'Geography', 'Hard', 'Nile', 'Amazon', 'Yangtze', 'Mississippi', 'Nile', 'Which is the longest river in the world?');

-- INSERT INTO public.Question (id, category, difficulty_level, option1, option2, option3, option4, right_answer, question_title)
-- VALUES 
-- (10, 'Literature', 'Easy', 'Harper Lee', 'J.D. Salinger', 'F. Scott Fitzgerald', 'Ernest Hemingway', 'Harper Lee', 'Who wrote "To Kill a Mockingbird"?');
