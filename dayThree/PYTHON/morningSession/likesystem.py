def getLikes(likes):
    text_display = ""

    if len(likes) == 0:
        text_display = "no one likes this"
        
    elif len(likes) == 1:
        text_display = f"{likes[0]} likes this"
        
    elif len(likes) == 2:
        text_display = f"{likes[0]} and {likes[1]} likes this"
        
    elif len(likes) == 3:
        text_display = f"{likes[0]} {likes[1]} and one other likes this"        
        
    else:
        text_display = f"{likes[0]} {likes[1]} and {len(likes)-2} likes this"
    
    return text_display
        


    
