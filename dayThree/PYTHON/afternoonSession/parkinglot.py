def get_slots(slots):
    available = 0
    filled = 0
    for park in range(len(slots)):
        slots[0] = 1
        slots[2] = 1
        slots[3] = 1
        slots[4] = 1
        slots[-1] = 1
        slots[-2] = 1
        #slots.insert(1, 1)
        #filled += 1
        #available -= 1

    return slots

