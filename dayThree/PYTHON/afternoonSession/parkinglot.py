def get_slots(slots):
    available = 0
    filled = 0
    for index in range(len(slots)):
        slots[0] = 1
        slots[2] = 1
        slots[3] = 1
        slots[4] = 1
        slots[-1] = 1
        slots[-2] = 1
        slots[-6] = 0
        slots[-7] = 0
        if slots[index] == 0:
            available += 1
        elif slots[index] == 1:
            filled += 1

    return slots
    
#def get_available_slots

