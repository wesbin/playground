<script setup>

</script>

<template>
  <header class="header">
    <div class="logo-container">
      <div class="logo">GUNU</div>
    </div>
    <div class="menu-container">
      <div class="menu">만화</div>
      <div class="menu">음악</div>
    </div>
    <div class="empty-container"></div>
  </header>
</template>

<style lang="scss" scoped>
.header {
  display: grid;
  gap: 10px;
  height: 60px;
  background-color: $HEADER-COLOR;
  grid-template-columns: 1fr 3fr 1fr;
  justify-items: center;
  align-items: center;
  color: $WHITE-FONT;

  .logo-container {
    padding-left: 20px;
    justify-self: start;
  }

  .menu-container {
    display: flex;
    height: 100%;
    gap: 10px;

    .menu {
      display: flex;
      align-items: center;
      justify-content: center;
      width: 100px;
      height: 100%;
      cursor: pointer;

      &:hover {
        background-color: $SELECTED-MENU;
      }
    }
  }
}
</style>