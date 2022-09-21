<script setup>
const clickTopButton = () => {
  window.scrollTo(0, 0)
}
</script>

<template>
  <div
    class="top-button"
    @click="clickTopButton"
  >
    🔝
  </div>
</template>

<style scoped>
.top-button {
  position: fixed;
  bottom: 5%;
  right: 10%;
  background-color: white;
  user-select: none;
  cursor: pointer;
  font-size: 25px;
  border-radius: 25px;
}
</style>