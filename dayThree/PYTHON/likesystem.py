def getLikes(likes):
    text_display = " "

    if len(likes) == 0:
        text_display = "no one likes this"
        
    if len(likes) == 1:
        text_display = f"{likes[0]} likes this"
        
    if len(likes) == 2:
        text_display = f"{likes[0]} and {likes[1]} likes this"
        
    if len(likes) == 3:
        text_display = f"{likes[0]} {likes[1]} and {likes[2]} likes this"
        
    if len(likes) == 4:
        text_display = f"{likes[0]} {likes[1]} and 2 others likes this"
    
    return text_display
        


    
