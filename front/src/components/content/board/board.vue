<script setup>
class Tab {
  constructor(name) {
    this.name = name
  }
}


const props = defineProps({
  tabs: {
    required: true,
    type: Array<Tab>
  }
});
</script>

<template>
  <div class="board">

  </div>
</template>

<style scoped>
.board {
  height: 300px;
}
</style>